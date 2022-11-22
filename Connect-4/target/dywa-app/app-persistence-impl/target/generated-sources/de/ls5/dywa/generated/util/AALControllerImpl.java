package de.ls5.dywa.generated.util;

import javax.inject.Inject;
import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.FlushModeType;
import javax.persistence.PersistenceContext;

@RequestScoped
public class AALControllerImpl implements AALController {

	@PersistenceContext
	private EntityManager entityManager;

	@Inject
	private de.ls5.dywa.generated.controller.models.app.ConcreteUserController ConcreteUserController;
	@Inject
	private de.ls5.dywa.generated.controller.models.app.BaseUserController BaseUserController;
	@Inject
	private de.ls5.dywa.generated.controller.models.app.BoardController BoardController;
	@Inject
	private de.ls5.dywa.generated.controller.models.app.ColumnController ColumnController;
	@Inject
	private de.ls5.dywa.generated.controller.models.app.CellController CellController;
	@Inject
	private de.ls5.dywa.generated.controller.models.app.TempColumnController TempColumnController;

	@Override
	public void reset() {

	final FlushModeType oldFlushMode = this.entityManager.getFlushMode();
	this.entityManager.flush();
	this.entityManager.setFlushMode(FlushModeType.COMMIT);

	for (final de.ls5.dywa.generated.entity.models.app.ConcreteUser o : ConcreteUserController.fetch()) {
	ConcreteUserController.deleteWithIncomingReferences(o);
	}
	for (final de.ls5.dywa.generated.entity.models.app.BaseUser o : BaseUserController.fetch()) {
	BaseUserController.deleteWithIncomingReferences(o);
	}
	for (final de.ls5.dywa.generated.entity.models.app.Board o : BoardController.fetch()) {
	BoardController.deleteWithIncomingReferences(o);
	}
	for (final de.ls5.dywa.generated.entity.models.app.Column o : ColumnController.fetch()) {
	ColumnController.deleteWithIncomingReferences(o);
	}
	for (final de.ls5.dywa.generated.entity.models.app.Cell o : CellController.fetch()) {
	CellController.deleteWithIncomingReferences(o);
	}
	for (final de.ls5.dywa.generated.entity.models.app.TempColumn o : TempColumnController.fetch()) {
	TempColumnController.deleteWithIncomingReferences(o);
	}

		this.entityManager.setFlushMode(oldFlushMode);
	}
}
