package DataSource;

public class M2ValuesListDataSourceFactory implements M2DataSourceFactory {

    @Override
    public M2DataSource createM2DataSource() {
        return new M2DBDataSource();
    }

    @Override
    public String fetchData() {
        return "";
    }
}
