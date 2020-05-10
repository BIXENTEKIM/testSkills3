package com.testSkills2.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QCustomers is a Querydsl query type for Customers
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QCustomers extends EntityPathBase<Customers> {

    private static final long serialVersionUID = -64234989L;

    public static final QCustomers customers = new QCustomers("customers");

    public final NumberPath<Long> Age = createNumber("Age", Long.class);

    public final DateTimePath<java.sql.Timestamp> CreatedOn = createDateTime("CreatedOn", java.sql.Timestamp.class);

    public final NumberPath<Long> CustomerId = createNumber("CustomerId", Long.class);

    public final DateTimePath<java.util.Date> DOB = createDateTime("DOB", java.util.Date.class);

    public final StringPath FirstName = createString("FirstName");

    public final StringPath Gender = createString("Gender");

    public final StringPath OtherNames = createString("OtherNames");

    public QCustomers(String variable) {
        super(Customers.class, forVariable(variable));
    }

    public QCustomers(Path<? extends Customers> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCustomers(PathMetadata<?> metadata) {
        super(Customers.class, metadata);
    }

}

