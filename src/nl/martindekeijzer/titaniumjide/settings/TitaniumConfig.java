package nl.martindekeijzer.titaniumjide.settings;

import com.intellij.openapi.components.*;
import com.intellij.util.xmlb.XmlSerializerUtil;
import org.jetbrains.annotations.Nullable;

/**
 * Created by martin on 31/03/15.
 */
@State(
        name = "TitaniumConfig",
        storages = {
                @Storage(
                        file = StoragePathMacros.APP_CONFIG + "/other.xml"
                )
        }
)
public class TitaniumConfig implements PersistentStateComponent<TitaniumConfig> {
    public boolean INSERT_WHITESPACE = false;

    public static TitaniumConfig getInstance() {
        return ServiceManager.getService(TitaniumConfig.class);
    }

    @Nullable
    @Override
    public TitaniumConfig getState() {
        return this;
    }

    @Override
    public void loadState(TitaniumConfig state) {
        XmlSerializerUtil.copyBean(state, this);
    }
}
