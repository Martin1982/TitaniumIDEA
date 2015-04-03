package nl.martindekeijzer.titaniumjide.sdk;

import com.intellij.openapi.projectRoots.*;
import com.intellij.openapi.util.io.FileUtil;
import com.intellij.openapi.util.Pair;
import org.jdom.Element;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.File;

/**
 * Created by martin on 03/04/15.
 */
public class TitaniumSdkType extends SdkType {
    @NonNls public static final String SDK_NAME = "Titanium SDK";
    @NonNls public static final String DEFAULT_EXTERNAL_DOCUMENTATION_URL = "http://docs.appcelerator.com/titanium/latest/#!/api";

    public TitaniumSdkType() { super(SDK_NAME); }

    public static TitaniumSdkType getInstance() {
        return SdkType.findInstance(TitaniumSdkType.class);
    }

    @Nullable
    @Override
    public String suggestHomePath() {
        return null;
    }

    @Override
    public boolean isValidSdkHome(String path) {
        return validateTitaniumSdk(path).getFirst();
    }

    @NotNull
    public static Pair<Boolean, String> validateTitaniumSdk(@Nullable String path) {
        if (path == null) {
            return Pair.create(Boolean.FALSE, "");
        }

        path = FileUtil.toSystemDependentName(path);
        final File f = new File(path);
        if (!f.exists() || !f.isDirectory()) {
            return Pair.create(Boolean.FALSE, "SDK does not exist");
        }

        //noinspection ConstantConditions
        return Pair.create(Boolean.TRUE, null);
    }

    @Override
    public String suggestSdkName(String currentSdkName, String sdkHome) {
        return SDK_NAME;
    }

    @Nullable
    @Override
    public AdditionalDataConfigurable createAdditionalDataConfigurable(SdkModel sdkModel, SdkModificator sdkModificator) {
        return null;
    }

    @Override
    public String getPresentableName() {
        return "Titanium SDK";
    }

    @Override
    public void saveAdditionalData(SdkAdditionalData additionalData, Element additional) {

    }
}
