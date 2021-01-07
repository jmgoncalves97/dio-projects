using System;
using System.Collections.Generic;
using Api.Data.Collections;
using Api.Models;
using Microsoft.AspNetCore.Mvc;
using MongoDB.Driver;

namespace Api.Controllers
{
    [ApiController]
    [Route("[controller]")]
    public class InfectadoController : ControllerBase
    {
        Data.MongoDB _mongoDB;
        IMongoCollection<Infectado> _infectadosCollection;

        public InfectadoController(Data.MongoDB mongoDB)
        {
            _mongoDB = mongoDB;
            _infectadosCollection = _mongoDB.DB.GetCollection<Infectado>(typeof(Infectado).Name.ToLower());
        }

        // [HttpPost]
        // public ActionResult SalvarInfectado([FromBody] InfectadoDto dto)
        // {
        //     var infectado = new Infectado(dto.DataNascimento, dto.Sexo, dto.Latitude, dto.Longitude);

        //     _infectadosCollection.InsertOne(infectado);
            
        //     return StatusCode(201, "Infectado adicionado com sucesso");
        // }

        // [HttpGet]
        // public ActionResult ObterInfectados()
        // {
        //     var infectados = _infectadosCollection.Find(Builders<Infectado>.Filter.Empty).ToList();
            
        //     return Ok(infectados);
        // }

        [HttpPost]
        public ActionResult SalvarInfectado([FromBody] InfectadoDto dto)
        {
            var infectado = new Infectado(dto.Id, dto.DataNascimento, dto.Sexo, dto.Latitude, dto.Longitude);
            
            _infectadosCollection.InsertOne(infectado);
            
            return StatusCode(201, "Infectado adicionado com sucesso");
        }

        [HttpGet]
        public ActionResult ObterInfectados()
        {
            var infectados = _infectadosCollection.Find(Builders<Infectado>.Filter.Empty).ToList();
            
            return Ok(infectados);
        }

        [HttpDelete("{Id}")]
        public ActionResult DeletarInfectado(int id)
        {
            _infectadosCollection.DeleteOne(Builders<Infectado>.Filter.Where(_ => _.Id == id));
            
            return Ok("Infectado deletado!");
        }

        [HttpPut]
        public ActionResult AtualizarInfectado([FromBody] InfectadoDto dto, string campo)
        {
            _infectadosCollection.UpdateOne(Builders<Infectado>.Filter.Where(_ => _.Id == dto.Id), Builders<Infectado>.Update.Set("DataNascimento", dto.DataNascimento));
            _infectadosCollection.UpdateOne(Builders<Infectado>.Filter.Where(_ => _.Id == dto.Id), Builders<Infectado>.Update.Set("Sexo", dto.Sexo));
            _infectadosCollection.UpdateOne(Builders<Infectado>.Filter.Where(_ => _.Id == dto.Id), Builders<Infectado>.Update.Set("Latitude", dto.Latitude));
            _infectadosCollection.UpdateOne(Builders<Infectado>.Filter.Where(_ => _.Id == dto.Id), Builders<Infectado>.Update.Set("Longitude", dto.Longitude));
            
            return Ok("Infectado Atualizado");
        }
    }
}
