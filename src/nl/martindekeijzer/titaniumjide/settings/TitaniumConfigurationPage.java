package nl.martindekeijzer.titaniumjide.settings;

import com.intellij.openapi.options.BeanConfigurable;
import com.intellij.openapi.options.UnnamedConfigurable;
import com.intellij.ui.IdeBorderFactory;

import javax.swing.*;

/**
 * Created by martin on 31/03/15.
 */
public class TitaniumConfigurationPage extends BeanConfigurable<TitaniumConfig> implements UnnamedConfigurable{
    protected TitaniumConfigurationPage() {
        super(TitaniumConfig.getInstance());

        checkBox("INSERT_WHITESPACE", "Auto-insert whitespace in the interpolations");
    }

    @Override
    public JComponent createComponent() {
        JComponent result = super.createComponent();
        assert result != null;
        result.setBorder(IdeBorderFactory.createTitledBorder("Titanium"));
        return result;
    }

}
