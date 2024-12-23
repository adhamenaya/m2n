package DataSource;

public class M2LegacyFormDataSourceFactory implements M2DataSourceFactory{

    @Override
    public M2DataSource createM2DataSource() {
        return new M2WSDataSource();
    }

    @Override
    public String fetchData() {
        return "";
    }
}
