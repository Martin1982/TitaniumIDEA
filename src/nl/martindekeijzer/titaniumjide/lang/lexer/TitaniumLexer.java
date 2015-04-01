package nl.martindekeijzer.titaniumjide.lang.lexer;

import com.intellij.lang.javascript.JSTokenTypes;
import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.MergingLexerAdapter;
import com.intellij.psi.tree.TokenSet;

import java.io.Reader;

/**
 * Created by martin on 01/04/15.
 */
public class TitaniumLexer extends MergingLexerAdapter {
    public TitaniumLexer() {
        super(new FlexAdapter(new _TitaniumLexer((Reader)null)), TokenSet.create(JSTokenTypes.STRING_LITERAL));
    }
}
