package hr.hrcity.eredar.service;
import hr.hrcity.eredar.model.Upravitelji;
public interface UpraviteljiService {

	Upravitelji createEntity(Upravitelji entityData);

	Upravitelji updateEntity(Upravitelji entityData);

	Iterable<Upravitelji> getAllEntity();

	void deleteEntity(Integer entityId);

	Upravitelji getEntityById(Integer entityId);

}
