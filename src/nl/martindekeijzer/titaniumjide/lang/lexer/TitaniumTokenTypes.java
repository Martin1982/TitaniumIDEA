package nl.martindekeijzer.titaniumjide.lang.lexer;

import com.intellij.lang.javascript.JSTokenTypes;

/**
 * Created by martin on 01/04/15.
 */
public interface TitaniumTokenTypes extends JSTokenTypes {
    TitaniumTokenType ESCAPE_SEQUENCE = new TitaniumTokenType("ESCAPE_SEQUENCE");
    TitaniumTokenType INVALID_ESCAPE_SEQUENCE = new TitaniumTokenType("INVALID_ESCAPE_SEQUENCE");
    TitaniumTokenType TRACK_BY_KEYWORD = new TitaniumTokenType("TRACK_BY_KEYWORD");
    TitaniumTokenType ONE_TIME_BINDING = new TitaniumTokenType("ONE_TIME_BINDING");
}
