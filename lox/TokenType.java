enum TokenType {
    // Single Character
    LEFT_PAREN, RIGHT_PAREN, LEFT_BRACE, RIGHT_BRACE,
    COMMA, DOT, MINUS, PLUS, SEMICOLON, SLASH, STAR,


    // One or two chartacters
    BANG, BANG_EQUAL, 
    EQUAL, EQUAL_EQUAL,
    GREATER, GREATER_EQUAL,
    LESS, LESS_EQUAL,

    // Literals
    IDENTIFIER, STRING, NUMBER,

    // Keywords
    AND, CLASS, FUN, ELSE, FALSE, TRUE, FOR, IF, NIL, OR,
    PRINT, RETURN, SUPER, THIS, VAR, WHILE,

    // Extras
    EOF
}