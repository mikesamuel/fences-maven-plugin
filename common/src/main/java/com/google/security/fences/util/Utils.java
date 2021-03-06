package com.google.security.fences.util;

import org.apache.maven.artifact.Artifact;

/**
 * Miscellaneous side-effect-free utilities.
 */
public final class Utils {
  /** artifact:group:version style Maven artifact identifier. */
  public static String artToString(Artifact art) {
    // TODO: Replace once we update to a version of ArtifactUtils that has
    // key(Artifact)?
    // Is this redundant with Artifact.getId()?  The format of that is not
    // documented.
    return art.getGroupId() + ":" + art.getArtifactId()
        + ":" + art.getVersion();
  }

  private Utils() {
  }
}
