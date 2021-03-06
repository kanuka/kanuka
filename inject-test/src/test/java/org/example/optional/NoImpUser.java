package org.example.optional;

import jakarta.inject.Singleton;
import org.jetbrains.annotations.Nullable;

@Singleton
class NoImpUser {

  final NoImpHere noImpHere;

  NoImpUser(@Nullable NoImpHere noImpHere) {
    this.noImpHere = noImpHere;
  }

  boolean hasNoImplementation() {
    return noImpHere == null;
  }
}
