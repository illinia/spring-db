package hello.jdbc.connection;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

import static org.assertj.core.api.Assertions.*;

@Slf4j
public class DBConnectionUtilTest {

    @Test
    public void connection() throws Exception {
        Connection connection = DBConnectionUtil.getConnection();
        assertThat(connection).isNotNull();
    }

}
