package com.testSkills2.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QUserDetails is a Querydsl query type for UserDetails
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QUserDetails extends EntityPathBase<UserDetails> {

    private static final long serialVersionUID = 1427618357L;

    public static final QUserDetails userDetails = new QUserDetails("userDetails");

    public final StringPath password = createString("password");

    public final StringPath user = createString("user");

    public final NumberPath<Long> UserId = createNumber("UserId", Long.class);

    public QUserDetails(String variable) {
        super(UserDetails.class, forVariable(variable));
    }

    public QUserDetails(Path<? extends UserDetails> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUserDetails(PathMetadata<?> metadata) {
        super(UserDetails.class, metadata);
    }

}

