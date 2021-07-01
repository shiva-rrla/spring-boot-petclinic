package com.corenttech.petclinic.service.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import com.corenttech.petclinic.model.BaseEntity;

public abstract class AbstractMapService<T extends BaseEntity, ID> {

	protected Map<Long, T> data = new HashMap<>();

	public Set<T> findAll() {
		return new HashSet<>(this.data.values());
	}

	public T findById(ID id) {
		return this.data.get(id);
	}

	public T save(T entity) {
		if (Objects.nonNull(entity)) {
			if (Objects.isNull(entity.getId())) {
				entity.setId(getNextId());
			}
		}
		this.data.put(entity.getId(), entity);
		return entity;
	}

	private Long getNextId() {
		Long nextId = 1L;

		if (this.data.size() > 0) {
			nextId = Collections.max(this.data.keySet()) + 1;
		}
		return nextId;
	}

	public void delete(T entity) {
		this.data.entrySet().removeIf(entry -> entry.getValue().equals(entity));
	}

	public void deleteById(ID id) {
		this.data.remove(id);

	}

}
