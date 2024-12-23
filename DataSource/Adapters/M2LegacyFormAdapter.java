package DataSource.Adapters;

import DataSource.M2DataSource;
import DataSource.M2DataSourceFactory;
import DataSource.M2LegacyFormDataSourceFactory;

public class M2LegacyFormAdapter implements M2DataSourceFactory {
    private M2LegacyFormDataSourceFactory m2LegacyForm;

    @Override
    public M2DataSource createM2DataSource() {
        // create in the new M2 form
        return null;
    }

    @Override
    public String fetchData() {
        // read data from legacy M2 DB using the legacy query setup
        return "";
    }
}
