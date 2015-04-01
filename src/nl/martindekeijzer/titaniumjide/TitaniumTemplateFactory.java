package nl.martindekeijzer.titaniumjide;

import com.intellij.ide.util.projectWizard.WizardContext;
import com.intellij.platform.ProjectTemplate;
import com.intellij.platform.ProjectTemplatesFactory;
import nl.martindekeijzer.titaniumjide.module.TitaniumModuleBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by martin on 31/03/15.
 */
public class TitaniumTemplateFactory extends ProjectTemplatesFactory {
    @NotNull
    @Override
    public String[] getGroups() {
        return new String[]{TitaniumModuleBuilder.GROUP_NAME};
    }

    @NotNull
    @Override
    public ProjectTemplate[] createTemplates(@Nullable String group, WizardContext context) {
        return new ProjectTemplate[] {
            new TitaniumProjectGenerator()
        };
    }
}
