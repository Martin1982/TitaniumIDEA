package nl.martindekeijzer.titaniumjide.settings;

import com.intellij.openapi.application.PathManager;
import com.intellij.openapi.fileChooser.FileChooserDescriptor;
import com.intellij.openapi.options.Configurable;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.ui.TextComponentAccessor;
import com.intellij.openapi.ui.TextFieldWithBrowseButton;
import com.intellij.openapi.util.io.FileUtil;
import com.intellij.openapi.vfs.LocalFileSystem;
import com.intellij.openapi.vfs.VirtualFile;
import nl.martindekeijzer.titaniumjide.sdk.TitaniumSdkType;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created by martin on 03/04/15.
 */
public class TitaniumSDKConfigurable implements Configurable {
    private JComponent formComponent;
    private JPanel titaniumPanel;
    private TextFieldWithBrowseButton titaniumSDKPath;

    @Nls
    @Override
    public String getDisplayName() {
        return "Titanium SDK's";
    }

    @Nullable
    @Override
    public String getHelpTopic() {
        return null;
    }

    @Nullable
    @Override
    public JComponent createComponent() {
        String titaniumSDKPathLocation = "";
        BrowseFolderListener listener =
                new BrowseFolderListener("Select Titanium SDK Path", titaniumSDKPath, TitaniumSdkType.getInstance().getHomeChooserDescriptor(), titaniumSDKPathLocation);
        titaniumSDKPath.addBrowseFolderListener(null, listener);

        formComponent = (JComponent) titaniumPanel;
        return formComponent;
    }

    @Override
    public boolean isModified() {
        return true;
    }

    @Override
    public void apply() throws ConfigurationException {

    }

    @Override
    public void reset() {

    }

    @Override
    public void disposeUIResources() {

    }

    private static class BrowseFolderListener extends TextFieldWithBrowseButton.BrowseFolderActionListener<JTextField> {
        private final String myDefaultPath;

        public BrowseFolderListener(@Nullable String title,
                                    TextFieldWithBrowseButton textField,
                                    FileChooserDescriptor fileChooserDescriptor,
                                    @Nullable String defaultPath) {
            super(title, null, textField, null, fileChooserDescriptor, TextComponentAccessor.TEXT_FIELD_WHOLE_TEXT);
            myDefaultPath = defaultPath;
        }

        @Nullable
        @Override
        protected VirtualFile getInitialFile() {
            String dir = super.getComponentText();
            if (!dir.isEmpty()) {
                return super.getInitialFile();
            }

            return myDefaultPath == null
                    ? LocalFileSystem.getInstance().findFileByPath(FileUtil.toSystemIndependentName(PathManager.getHomePath()))
                    : LocalFileSystem.getInstance().findFileByPath(FileUtil.toSystemIndependentName(myDefaultPath));
        }
    }
}
