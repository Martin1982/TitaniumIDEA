package nl.martindekeijzer.titaniumjide;

import com.intellij.lang.javascript.boilerplate.AbstractGithubTagDownloadedProjectGenerator;
import com.intellij.platform.templates.github.GithubTagInfo;
import icons.TitaniumIcons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created by martin on 31/03/15.
 */
public class TitaniumProjectGenerator extends AbstractGithubTagDownloadedProjectGenerator {
    @NotNull
    @Override
    protected String getDisplayName() {
        return "Titanium";
    }

    @NotNull
    @Override
    public String getGithubUserName() {
        return "appcelerator";
    }

    @NotNull
    @Override
    public String getGithubRepositoryName() {
        return "KitchenSink";
    }

    @Nullable
    @Override
    public String getDescription() {
        return "<html>This project is a KitchenSink checkout for Appcelerator Titanium Mobile</html>";
    }

    @Override
    public Icon getIcon() {
        return TitaniumIcons.Titanium;
    }

    @Nullable
    @Override
    public String getPrimaryZipArchiveUrlForDownload(@NotNull GithubTagInfo tag) {
        return null;
    }
}
