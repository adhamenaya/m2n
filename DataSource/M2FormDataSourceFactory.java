package DataSource;

public class M2FormDataSourceFactory implements M2DataSourceFactory{

    @Override
    public M2DataSource createM2DataSource() {
        return new M2FormDataSource();
    }

    @Override
    public String fetchData() {
        return "";
    }
}
