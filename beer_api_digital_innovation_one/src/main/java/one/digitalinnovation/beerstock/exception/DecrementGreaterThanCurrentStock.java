package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class DecrementGreaterThanCurrentStock extends Exception {

    public DecrementGreaterThanCurrentStock(Long id, int quantityToDecrement, int stockQuantity) {
        super(String.format("Beers with %s ID to decrement informed of %s greater than current stock %s", id, quantityToDecrement, stockQuantity));
    }
}
