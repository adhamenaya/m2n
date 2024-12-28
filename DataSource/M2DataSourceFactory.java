package DataSource;

public interface M2DataSourceFactory {
    M2DataSource createM2DataSource();

    String fetchData();
}
