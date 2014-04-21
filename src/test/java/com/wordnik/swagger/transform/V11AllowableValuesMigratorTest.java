package com.wordnik.swagger.transform;

import com.wordnik.swagger.transform.migrate.V11AllowableValuesMigrator;

import java.io.IOException;

public final class V11AllowableValuesMigratorTest
    extends SwaggerMigratorTest
{
    public V11AllowableValuesMigratorTest()
        throws IOException
    {
        super("allowableValues", new V11AllowableValuesMigrator());
    }
}
