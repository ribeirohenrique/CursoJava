package model.exceptions;

import java.io.Serial;

public class DomainException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    //É passada a mensagem para ser exibida quando o metodo for chamado
    public DomainException(String msg) {
        super(msg);
    }
}
