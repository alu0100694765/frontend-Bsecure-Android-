/*
 * Copyright 2014 Google Inc. All rights reserved.
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

package com.tfg.sawan.bsecure.scan.util;

import android.annotation.TargetApi;
import android.os.Build.VERSION_CODES;

/**
 * It seems Android does not have a standard equivalent to com.google.common.time.[System]Clock.
 *
 * <p>Darn.
 */
public class SystemClock implements Clock {

  /**
   * @return current time in milliseconds
   */
  @Override
  public long currentTimeMillis() {
    return System.currentTimeMillis();
  }

  /**
   * @return time since the device was booted, in nanoseconds
   */
  @Override
  @TargetApi(VERSION_CODES.JELLY_BEAN_MR1)
  public long elapsedRealtimeNanos() {
    return android.os.SystemClock.elapsedRealtimeNanos();
  }
}
