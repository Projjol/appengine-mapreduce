// Copyright 2011 Google Inc. All Rights Reserved.

package com.google.appengine.tools.mapreduce.inputs;

import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Query;
import com.google.common.base.Functions;

/**
 * An InputReader for Datastore entities.
 */
public class DatastoreInputReader extends BaseDatastoreInputReader<Entity> {

  private static final long serialVersionUID = -2164845668646485549L;
  private static final long AVERAGE_ENTITY_SIZE = 100 * 1024;

  public DatastoreInputReader(Query query) {
    super(query, Functions.<Entity>identity());
  }

  @Override
  protected long getAvgElementSize() {
    return AVERAGE_ENTITY_SIZE;
  }
}
