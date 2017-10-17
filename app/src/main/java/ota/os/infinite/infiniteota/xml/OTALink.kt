/*
 * Copyright (C) 2015 Chandra Poerwanto
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

package ota.os.infinite.infiniteota.xml

class OTALink(private val mId: String?) {
    var title: String? = null
        get() = if (field == null) "" else field
    var description: String? = null
        get() = if (field == null) "" else field
    var url: String? = null
        get() = if (field == null) "" else field

    val id: String
        get() = mId ?: ""
}
