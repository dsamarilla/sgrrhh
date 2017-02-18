package sesion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entidad.Liquidacion;
import com.entidad.LiquidacionDetalle;
import com.entidad.Persona;

public class SesionLiquidacion {
	
private EntityManagerFactory emf = null;
	
	public SesionLiquidacion() {
		emf = Persistence.createEntityManagerFactory("UnitSgrrhh_db");
	}

	public EntityManager getEntityManager() {
		return emf.createEntityManager();
	}

	public void insertar(Liquidacion emp,LiquidacionDetalle liqDet) throws Exception {
		EntityManager em = getEntityManager();
		try {			
			em.getTransaction().begin();
			em.persist(emp);
			em.persist(liqDet);
			em.getTransaction().commit();
		} catch (Exception ex) {
			throw new Exception(ex);
		} finally {
			if (em != null) {
				em.close();
			}
		}
	}
	

}
