package wisell.data.repo;

import org.mongodb.morphia.dao.BasicDAO;

import wisell.data.config.DBParams;

public abstract class AbstractRepository<E, K> extends BasicDAO<E, K>{
	static DBParams dbParams = DBParams.getInstance();
	protected AbstractRepository() {
		super(dbParams.getMongo(), dbParams.getMorphia(), dbParams.getDb().getName());
	}
}
