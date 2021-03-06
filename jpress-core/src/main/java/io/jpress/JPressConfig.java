/**
 * Copyright (c) 2016-2019, Michael Yang 杨福海 (fuhai999@gmail.com).
 * <p>
 * Licensed under the GNU Lesser General Public License (LGPL) ,Version 3.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.gnu.org/licenses/lgpl-3.0.txt
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.jpress;

import io.jboot.Jboot;
import io.jboot.config.annotation.PropertyConfig;

/**
 * @author Michael Yang 杨福海 （fuhai999@gmail.com）
 * @version V1.0
 * @Title: JPress 环境配置
 * @Package io.jpress
 */
@PropertyConfig(prefix = "io.jpress")
public class JPressConfig {

    private String indexAction = "/page";
    private String defaultTemplate; //通过 jboot.properties 配置文件来进行配置


    public String getIndexAction() {
        return indexAction;
    }

    public void setIndexAction(String indexAction) {
        this.indexAction = indexAction;
    }

    public String getDefaultTemplate() {
        return defaultTemplate;
    }

    public void setDefaultTemplate(String defaultTemplate) {
        this.defaultTemplate = defaultTemplate;
    }

    public static final JPressConfig me = Jboot.config(JPressConfig.class);
}
