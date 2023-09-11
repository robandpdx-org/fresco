/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.facebook.imagepipeline.platform

class PlatformDecoderOptions(
    val useOutConfig: Boolean = false,
    val fixReadingOptions: Boolean = false,
    val avoidPool: Boolean = false,
)
