/**
 *      Copyright (C) 2010 EdgyTech Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.edgytech.umongo;

import com.edgytech.swingfast.Div;

/**
 *
 * @author antoine
 */
public class JobBar extends Div {

    void addJob(DbJob job) {
        addChild(job);
        structureComponent();
    }

    void removeJob(DbJob job) {
        removeChild(job);
        structureComponent();
    }

}
