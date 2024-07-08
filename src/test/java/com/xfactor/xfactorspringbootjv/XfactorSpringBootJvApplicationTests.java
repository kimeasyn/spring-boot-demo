package com.xfactor.xfactorspringbootjv;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

import javax.sql.DataSource;
import java.sql.SQLException;


@SpringBootTest
class XfactorSpringBootJvApplicationTests {

    @Autowired
    private DataSource dataSource;

    @Test
    public void givenDatasourceAvailableWhenAccessDetailsThenExpectDetails() throws SQLException {
        System.out.printf(dataSource.getConnection().getMetaData().getDatabaseProductName());
        assertThat(dataSource.getConnection().getMetaData().getDatabaseProductName()).isEqualTo("PostgreSQL");
    }

    @Test
    void contextLoads() {
    }

}
