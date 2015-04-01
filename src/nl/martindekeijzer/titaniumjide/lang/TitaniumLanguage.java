package nl.martindekeijzer.titaniumjide.lang;

import com.intellij.lang.javascript.JSLanguageDialect;
import com.intellij.lang.javascript.DialectOptionHolder;

/**
 * Created by martin on 01/04/15.
 */
public class TitaniumLanguage extends JSLanguageDialect {
    public static final TitaniumLanguage INSTANCE = new TitaniumLanguage();

    protected TitaniumLanguage() {
        super("Titanium", DialectOptionHolder.OTHER);
    }

    public String getFileExtension() {
        return "js";
    }
}
