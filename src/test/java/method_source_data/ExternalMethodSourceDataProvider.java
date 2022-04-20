package method_source_data;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class ExternalMethodSourceDataProvider {

    public static Stream<Arguments> navigationMenuDataProvider() {
        return Stream.of(
                Arguments.of(0, "Insights"),
                Arguments.of(1, "Services"),
                Arguments.of(2, "Industries"),
                Arguments.of(3, "Careers"),
                Arguments.of(4, "About Accenture")
        );
    }
}
