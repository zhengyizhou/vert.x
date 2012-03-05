/*
 * Copyright 2011-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.vertx.java.tests.core.filesystem;

import org.junit.Test;
import org.vertx.java.core.AsyncResult;
import org.vertx.java.core.AsyncResultHandler;
import org.vertx.java.core.buffer.Buffer;
import org.vertx.java.core.file.FileSystem;
import org.vertx.java.core.logging.Logger;
import org.vertx.java.core.logging.impl.LoggerFactory;
import org.vertx.java.core.shareddata.SharedData;
import org.vertx.java.framework.TestBase;
import vertx.tests.core.filesystem.TestClient;

import java.util.Map;

/**
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
public class JavaFileSystemTest extends TestBase {

  private static final Logger log = LoggerFactory.getLogger(JavaFileSystemTest.class);

  private Map<String, Object> params;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    params = SharedData.instance.getMap("params");
    startApp(TestClient.class.getName());
  }

  @Override
  protected void tearDown() throws Exception {
    super.tearDown();
  }

  @Test
  public void testSimpleCopy() throws Exception {
    startTest(getMethodName());
  }

  @Test
  public void testSimpleCopyFileAlreadyExists() throws Exception {
    startTest(getMethodName());
  }

  @Test
  public void testCopyIntoDir() throws Exception {
    startTest(getMethodName());
  }

  @Test
  public void testCopyEmptyDir() throws Exception {
    startTest(getMethodName());
  }

  @Test
  public void testCopyNonEmptyDir() throws Exception {
    startTest(getMethodName());
  }

  @Test
  public void testFailCopyDirAlreadyExists() throws Exception {
    startTest(getMethodName());
  }

  @Test
  public void testRecursiveCopy() throws Exception {
    startTest(getMethodName());
  }

  @Test
  public void testSimpleMove() throws Exception {
    startTest(getMethodName());
  }

  @Test
  public void testSimpleMoveFileAlreadyExists() throws Exception {
    startTest(getMethodName());
  }

  @Test
  public void testMoveEmptyDir() throws Exception {
    startTest(getMethodName());
  }

  @Test
  public void testMoveEmptyDirTargetExists() throws Exception {
    startTest(getMethodName());
  }

  @Test
  public void testMoveNonEmptyDir() throws Exception {
    startTest(getMethodName());
  }

  @Test
  public void testTruncate() throws Exception {
    startTest(getMethodName());
  }

  @Test
  public void testTruncateFileDoesNotExist() throws Exception {
    startTest(getMethodName());
  }

  @Test
  public void testChmodNonRecursive1() throws Exception {
    params.put("perms", "rw-------");
    startTest(getMethodName());
  }

  @Test
  public void testChmodNonRecursive2() throws Exception {
    params.put("perms", "rwx------");
    startTest(getMethodName());
  }

  @Test
  public void testChmodNonRecursive3() throws Exception {
    params.put("perms", "rw-rw-rw-");
    startTest(getMethodName());
  }

  @Test
  public void testChmodNonRecursive4() throws Exception {
    params.put("perms", "rw-r--r--");
    startTest(getMethodName());
  }

  @Test
  public void testChmodNonRecursive5() throws Exception {
    params.put("perms", "rw--w--w-");
    startTest(getMethodName());
  }

  @Test
  public void testChmodNonRecursive6() throws Exception {
    params.put("perms", "rw-rw-rw-");
    startTest(getMethodName());
  }

  @Test
  public void testChmodRecursive1() throws Exception {
    params.put("perms", "rw-------");
    params.put("dirPerms", "rwx------");
    startTest(getMethodName());
  }

  @Test
  public void testChmodRecursive2() throws Exception {
    params.put("perms", "rwx------");
    params.put("dirPerms", "rwx------");
    startTest(getMethodName());
  }

  @Test
  public void testChmodRecursive3() throws Exception {
    params.put("perms", "rw-rw-rw-");
    params.put("dirPerms", "rwxrw-rw-");
    startTest(getMethodName());
  }

  @Test
  public void testChmodRecursive4() throws Exception {
    params.put("perms", "rw-r--r--");
    params.put("dirPerms", "rwxr--r--");
    startTest(getMethodName());
  }

  @Test
  public void testChmodRecursive5() throws Exception {
    params.put("perms", "rw--w--w-");
    params.put("dirPerms", "rwx-w--w-");
    startTest(getMethodName());
  }

  @Test
  public void testChmodRecursive6() throws Exception {
    params.put("perms", "rw-rw-rw-");
    params.put("dirPerms", "rwxrw-rw-");
    startTest(getMethodName());
  }

  public void testProps() throws Exception {
    startTest(getMethodName());
  }

  public void testPropsFileDoesNotExist() throws Exception {
    startTest(getMethodName());
  }

  public void testPropsFollowLink() throws Exception {
    startTest(getMethodName());
  }

  public void testPropsDontFollowLink() throws Exception {
    startTest(getMethodName());
  }

  public void testLink() throws Exception {
    startTest(getMethodName());
  }

  public void testSymLink() throws Exception {
    startTest(getMethodName());
  }

  public void testUnlink() throws Exception {
    startTest(getMethodName());
  }

  public void testReadSymLink() throws Exception {
    startTest(getMethodName());
  }

  public void testSimpleDelete() throws Exception {
    startTest(getMethodName());
  }

  public void testDeleteEmptyDir() throws Exception {
    startTest(getMethodName());
  }

  public void testDeleteNonExistent() throws Exception {
    startTest(getMethodName());
  }

  public void testDeleteNonEmptyFails() throws Exception {
    startTest(getMethodName());
  }

  public void testDeleteRecursive() throws Exception {
    startTest(getMethodName());
  }

  public void testMkdirSimple() throws Exception {
    startTest(getMethodName());
  }

  public void testMkdirWithParentsFails() throws Exception {
    startTest(getMethodName());
  }

  public void testMkdirWithPerms() throws Exception {
    startTest(getMethodName());
  }

  public void testMkdirCreateParents() throws Exception {
    startTest(getMethodName());
  }

  public void testMkdirCreateParentsWithPerms() throws Exception {
    startTest(getMethodName());
  }

  public void testReadDirSimple() throws Exception {
    startTest(getMethodName());
  }

  public void testReadDirWithFilter() throws Exception {
    startTest(getMethodName());
  }

  public void testReadFile() throws Exception {
    startTest(getMethodName());
  }

  public void testWriteFile() throws Exception {
    startTest(getMethodName());
  }

  public void testWriteAsync() throws Exception {
    startTest(getMethodName());
  }

  public void testReadAsync() throws Exception {
    startTest(getMethodName());
  }

  public void testWriteStream() throws Exception {
    startTest(getMethodName());
  }

  public void testReadStream() throws Exception {
    startTest(getMethodName());
  }

  public void testPumpFileStreams() throws Exception {
    startTest(getMethodName());
  }

  public void testCreateFileWithPerms() throws Exception {
    startTest(getMethodName());
  }

  public void testCreateFileNoPerms() throws Exception {
    startTest(getMethodName());
  }

  public void testCreateFileAlreadyExists() throws Exception {
    startTest(getMethodName());
  }

  public void testExists() throws Exception {
    startTest(getMethodName());
  }

  public void testNotExists() throws Exception {
    startTest(getMethodName());
  }

  public void testFSProps() throws Exception {
    startTest(getMethodName());
  }


  private AsyncResultHandler createHandler() {
    return new AsyncResultHandler<Void>() {
      public void handle(AsyncResult<Void> event) {
      }
    };
  }

//  @Test
//  public void testExistsNoContext() throws Exception {
//    try {
//      FileSystem.instance.exists("foo", createHandler());
//      fail("Should throw exception");
//    } catch (IllegalStateException e) {
//      // Ok
//    }
//  }
//
//
//  @Test
//  public void testChmod1NoContext() throws Exception {
//    try {
//      FileSystem.instance.chmod("foo", "bar", createHandler());
//      fail("Should throw exception");
//    } catch (IllegalStateException e) {
//      // Ok
//    }
//  }
//
//  @Test
//  public void testChmod2NoContext() throws Exception {
//    try {
//      FileSystem.instance.chmod("foo", "bar", "quux", createHandler());
//      fail("Should throw exception");
//    } catch (IllegalStateException e) {
//      // Ok
//    }
//  }
//
//  @Test
//  public void testCopy1NoContext() throws Exception {
//    try {
//      FileSystem.instance.copy("foo", "bar", createHandler());
//      fail("Should throw exception");
//    } catch (IllegalStateException e) {
//      // Ok
//    }
//  }
//
//  @Test
//  public void testCopy2NoContext() throws Exception {
//    try {
//      FileSystem.instance.copy("foo", "bar", true, createHandler());
//      fail("Should throw exception");
//    } catch (IllegalStateException e) {
//      // Ok
//    }
//  }
//
//  @Test
//  public void testCreateFile1NoContext() throws Exception {
//    try {
//      FileSystem.instance.createFile("foo", createHandler());
//      fail("Should throw exception");
//    } catch (IllegalStateException e) {
//      // Ok
//    }
//  }
//
//  @Test
//  public void testCreateFile2NoContext() throws Exception {
//    try {
//      FileSystem.instance.createFile("foo", "bar", createHandler());
//      fail("Should throw exception");
//    } catch (IllegalStateException e) {
//      // Ok
//    }
//  }
//
//  @Test
//  public void testDelete1NoContext() throws Exception {
//    try {
//      FileSystem.instance.delete("foo", createHandler());
//      fail("Should throw exception");
//    } catch (IllegalStateException e) {
//      // Ok
//    }
//  }
//
//  @Test
//  public void testDelete2NoContext() throws Exception {
//    try {
//      FileSystem.instance.delete("foo", true, createHandler());
//      fail("Should throw exception");
//    } catch (IllegalStateException e) {
//      // Ok
//    }
//  }
//
//
//  @Test
//  public void testFSPropsNoContext() throws Exception {
//    try {
//      FileSystem.instance.fsProps("foo", createHandler());
//      fail("Should throw exception");
//    } catch (IllegalStateException e) {
//      // Ok
//    }
//  }
//
//  @Test
//  public void testLinkNoContext() throws Exception {
//    try {
//      FileSystem.instance.link("foo", "bar", createHandler());
//      fail("Should throw exception");
//    } catch (IllegalStateException e) {
//      // Ok
//    }
//  }
//
//
//  @Test
//  public void testLpropsNoContext() throws Exception {
//    try {
//      FileSystem.instance.lprops("foo", createHandler());
//      fail("Should throw exception");
//    } catch (IllegalStateException e) {
//      // Ok
//    }
//  }
//
//  @Test
//  public void testMkdir1NoContext() throws Exception {
//    try {
//      FileSystem.instance.mkdir("foo", createHandler());
//      fail("Should throw exception");
//    } catch (IllegalStateException e) {
//      // Ok
//    }
//  }
//
//  @Test
//  public void testMkdir2NoContext() throws Exception {
//    try {
//      FileSystem.instance.mkdir("foo", "bar", createHandler());
//      fail("Should throw exception");
//    } catch (IllegalStateException e) {
//      // Ok
//    }
//  }
//
//  @Test
//  public void testMkdir3NoContext() throws Exception {
//    try {
//      FileSystem.instance.mkdir("foo", true, createHandler());
//      fail("Should throw exception");
//    } catch (IllegalStateException e) {
//      // Ok
//    }
//  }
//
//  @Test
//  public void testMkdir4NoContext() throws Exception {
//    try {
//      FileSystem.instance.mkdir("foo", "bar", true, createHandler());
//      fail("Should throw exception");
//    } catch (IllegalStateException e) {
//      // Ok
//    }
//  }
//
//
//  @Test
//  public void testMoveNoContext() throws Exception {
//    try {
//      FileSystem.instance.move("foo", "bar", createHandler());
//      fail("Should throw exception");
//    } catch (IllegalStateException e) {
//      // Ok
//    }
//  }
//
//  @Test
//  public void testOpen1NoContext() throws Exception {
//    try {
//      FileSystem.instance.open("foo", createHandler());
//      fail("Should throw exception");
//    } catch (IllegalStateException e) {
//      // Ok
//    }
//  }
//
//  @Test
//  public void testOpen2NoContext() throws Exception {
//    try {
//      FileSystem.instance.open("foo", "bar", createHandler());
//      fail("Should throw exception");
//    } catch (IllegalStateException e) {
//      // Ok
//    }
//  }
//
//  @Test
//  public void testOpen3NoContext() throws Exception {
//    try {
//      FileSystem.instance.open("foo", "bar", true, createHandler());
//      fail("Should throw exception");
//    } catch (IllegalStateException e) {
//      // Ok
//    }
//  }
//
//  @Test
//  public void testOpen4NoContext() throws Exception {
//    try {
//      FileSystem.instance.open("foo", "bar", true, true, true, createHandler());
//      fail("Should throw exception");
//    } catch (IllegalStateException e) {
//      // Ok
//    }
//  }
//
//  @Test
//  public void testOpen5NoContext() throws Exception {
//    try {
//      FileSystem.instance.open("foo", "bar", true, true, true, true, createHandler());
//      fail("Should throw exception");
//    } catch (IllegalStateException e) {
//      // Ok
//    }
//  }
//
//
//  @Test
//  public void testPropsNoContext() throws Exception {
//    try {
//      FileSystem.instance.props("foo", createHandler());
//      fail("Should throw exception");
//    } catch (IllegalStateException e) {
//      // Ok
//    }
//  }
//
//  @Test
//  public void testReadDirNoContext() throws Exception {
//    try {
//      FileSystem.instance.readDir("foo", createHandler());
//      fail("Should throw exception");
//    } catch (IllegalStateException e) {
//      // Ok
//    }
//  }
//
//  @Test
//  public void testReadDir2NoContext() throws Exception {
//    try {
//      FileSystem.instance.readDir("foo", "bar", createHandler());
//      fail("Should throw exception");
//    } catch (IllegalStateException e) {
//      // Ok
//    }
//  }
//
//
//  @Test
//  public void testReadFileNoContext() throws Exception {
//    try {
//      FileSystem.instance.readFile("foo", createHandler());
//      fail("Should throw exception");
//    } catch (IllegalStateException e) {
//      // Ok
//    }
//  }
//
//  @Test
//  public void testReadSymLinkNoContext() throws Exception {
//    try {
//      FileSystem.instance.readSymlink("foo", createHandler());
//      fail("Should throw exception");
//    } catch (IllegalStateException e) {
//      // Ok
//    }
//  }
//
//  @Test
//  public void testSymLinkNoContext() throws Exception {
//    try {
//      FileSystem.instance.symlink("foo", "bar", createHandler());
//      fail("Should throw exception");
//    } catch (IllegalStateException e) {
//      // Ok
//    }
//  }
//
//  @Test
//  public void testTruncateNoContext() throws Exception {
//    try {
//      FileSystem.instance.truncate("foo", 1234, createHandler());
//      fail("Should throw exception");
//    } catch (IllegalStateException e) {
//      // Ok
//    }
//  }
//
//
//  @Test
//  public void testUnlinkNoContext() throws Exception {
//    try {
//      FileSystem.instance.unlink("foo", createHandler());
//      fail("Should throw exception");
//    } catch (IllegalStateException e) {
//      // Ok
//    }
//  }
//
//  @Test
//  public void testWriteFileNoContext() throws Exception {
//    try {
//      FileSystem.instance.writeFile("foo", Buffer.create("foo"), createHandler());
//      fail("Should throw exception");
//    } catch (IllegalStateException e) {
//      // Ok
//    }
//  }

}
