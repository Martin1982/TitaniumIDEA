package nl.martindekeijzer.titaniumjide.lang.lexer;

import com.intellij.psi.tree.IElementType;
import nl.martindekeijzer.titaniumjide.lang.TitaniumLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * Created by martin on 01/04/15.
 */
public class TitaniumTokenType extends IElementType {
    public TitaniumTokenType(@NotNull @NonNls String debugName) {
        super(debugName, TitaniumLanguage.INSTANCE);
    }
}
