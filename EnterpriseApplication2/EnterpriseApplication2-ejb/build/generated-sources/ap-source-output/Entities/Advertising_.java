package Entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Advertising.class)
public abstract class Advertising_ {

	public static volatile SingularAttribute<Advertising, Integer> price;
	public static volatile SingularAttribute<Advertising, String> name;
	public static volatile SingularAttribute<Advertising, Long> id;
	public static volatile SingularAttribute<Advertising, String> category;
	public static volatile SingularAttribute<Advertising, String> fullDescription;
	public static volatile SingularAttribute<Advertising, String> briefDescription;

}

