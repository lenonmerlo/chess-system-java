package boardgame;

import java.io.Serial;

public class BoardException extends RuntimeException {
    @Serial
    private static final long SerialVersionUID = 1L;

    public BoardException(String msg) {
        super(msg);
    }
}
