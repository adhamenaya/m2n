package DataSource;

public class M2FileDataSourceFactory implements M2DataSourceFactory {

    @Override
    public M2DataSource createM2DataSource() {
        return new M2FileDataSource();
    }

    @Override
    public String fetchData() {
        return "";
    }
}
