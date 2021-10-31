package io.github.kjwenger.sandbox;

import io.github.kjwenger.sandbox.client.ApplicationTest;
import com.google.gwt.junit.tools.GWTTestSuite;
import junit.framework.Test;
import junit.framework.TestSuite;

public class ApplicationSuite extends GWTTestSuite {
  public static Test suite() {
    TestSuite suite = new TestSuite("Tests for Application");
    suite.addTestSuite(ApplicationTest.class);
    return suite;
  }
}
