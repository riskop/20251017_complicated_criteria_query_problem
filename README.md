# 20251017_complicated_criteria_query_problem
asked on SO


running with spring-boot-starter-parent 3.0.0 - 3.1.0 versions ( hibernate 6.2.2 ) triggers the

```
ClassCastException: class org.hibernate.sql.ast.tree.from.LazyTableGroup cannot be cast to class org.hibernate.sql.ast.tree.from.PluralTableGroup
```

exception.

running with versions 3.1.1 and higher (hibernate 6.2.5 and upper) does not trigger it.
