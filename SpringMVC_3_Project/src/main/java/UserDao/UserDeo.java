package UserDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class UserDeo {
	@Autowired
   private HibernateTemplate hibernateTemplate;
	@Transactional
   public int saveUser(User user) {
	   int id = (Integer)this.hibernateTemplate.save(user);
	   return id;
	   
   }
public HibernateTemplate getHibernateTemplate() {
	return hibernateTemplate;
}
public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
	this.hibernateTemplate = hibernateTemplate;
}
   
}
