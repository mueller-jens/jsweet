/* 
 * JSweet - http://www.jsweet.org
 * Copyright (C) 2015 CINCHEO SAS <renaud.pawlak@cincheo.fr>
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
package source.tscomparison;

import static def.dom.Globals.console;

public class ThisIsThis {
	public static void main(String[] args) {
		ThisIsThis instance = new ThisIsThis();
		instance.getAction().run();
	}

	private int i = 8;

	public Runnable getAction() {
		return this::action;
	}

	public void action() {
		console.log(this.i); // this is always this, therefore this.i is 8
	}
}