/*
 * Copyright 2008 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.zxing.qrcode.decoder;

import com.google.zxing.ReaderException;
import junit.framework.TestCase;

/**
 * @author srowen@google.com (Sean Owen)
 */
public final class ErrorCorrectionLevelTestCase extends TestCase {

  public void testForBits() throws ReaderException {
    assertEquals(ErrorCorrectionLevel.M, ErrorCorrectionLevel.forBits(0));
    assertEquals(ErrorCorrectionLevel.L, ErrorCorrectionLevel.forBits(1));
    assertEquals(ErrorCorrectionLevel.H, ErrorCorrectionLevel.forBits(2));
    assertEquals(ErrorCorrectionLevel.Q, ErrorCorrectionLevel.forBits(3));
    try {
      ErrorCorrectionLevel.forBits(4);
      fail("Should have thrown an exception");
    } catch (ReaderException re) {
      // good
    }
  }


}