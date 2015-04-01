package nl.martindekeijzer.titaniumjide.lang;

import com.intellij.lang.javascript.JSTokenTypes;
import com.intellij.lang.javascript.highlighting.JSHighlighter;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SingleLazyInstanceSyntaxHighlighterFactory;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.psi.tree.IElementType;
import gnu.trove.THashMap;
import nl.martindekeijzer.titaniumjide.lang.lexer.TitaniumLexer;
import nl.martindekeijzer.titaniumjide.lang.lexer.TitaniumTokenTypes;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

/**
 * Created by martin on 01/04/15.
 */
public class TitaniumSyntaxHighlighterFactory extends SingleLazyInstanceSyntaxHighlighterFactory {
    @NotNull
    @Override
    protected SyntaxHighlighter createHighlighter() {
        return new TitaniumSyntaxHighlighter();
    }

    private static class TitaniumSyntaxHighlighter extends JSHighlighter {
        private final Map<IElementType, TextAttributesKey> myKeysMap = new THashMap<IElementType, TextAttributesKey>();

        public TitaniumSyntaxHighlighter() {
            super(TitaniumLanguage.INSTANCE.getOptionHolder());
            myKeysMap.put(JSTokenTypes.AS_KEYWORD, DefaultLanguageHighlighterColors.KEYWORD);
            myKeysMap.put(TitaniumTokenTypes.TRACK_BY_KEYWORD, DefaultLanguageHighlighterColors.KEYWORD);
        }

        @NotNull
        public TextAttributesKey[] getTokenHighlights(final IElementType tokenType) {
            if (myKeysMap.containsKey(tokenType)) {
                return pack(myKeysMap.get(tokenType));
            }
            return super.getTokenHighlights(tokenType);
        }

        @NotNull
        @Override
        public Lexer getHighlightingLexer() {
            return new TitaniumLexer();
        }
    }
}
