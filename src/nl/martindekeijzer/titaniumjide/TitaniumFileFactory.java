package nl.martindekeijzer.titaniumjide;

import com.intellij.ide.highlighter.HtmlFileType;
import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

/**
 * Created by martin on 31/03/15.
 */
public class TitaniumFileFactory extends FileTypeFactory {
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer consumer) {
        consumer.consume(HtmlFileType.INSTANCE, "tjs");
    }
}
