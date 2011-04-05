/* $This file is distributed under the terms of the license in /doc/license.txt$ */
package edu.cornell.mannlib.vitro.webapp.visualization.freemarker.valueobjects;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * original @author bkoniden (Deepak Konidena)
 * modified by @author cdtank (Chintan Tank) 
 */
public class Entity extends Individual {
	
	private Set<SubEntity> children = new LinkedHashSet<SubEntity>();
	
	public Entity(String entityURI, String entityLabel) {
		super(entityURI, entityLabel);
	}
	
	public Entity(String entityURI) {
		super(entityURI);
	}
	
	public String getEntityURI() {
		return this.getIndividualURI();
	}
	
	public String getEntityLabel() {
		return this.getIndividualLabel();
	}

	public Set<SubEntity> getSubEntities() {
		return children;
	}

	public void addSubEntity(SubEntity subEntity) {
		this.children.add(subEntity);
	}
	
	public void addSubEntitities(Collection<SubEntity> subEntities) {
		this.children.addAll(subEntities);
	}

}