/*******************************************************************************
 * Copyright 2017 Capital One Services, LLC and Bitwise, Inc.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 *******************************************************************************/
package hydrograph.engine.core.core;

//this class can be removed as it is just storing the graph object. The engine can directly work on jaxb generated graph object
import hydrograph.engine.jaxb.main.Graph;

public class HydrographJob {
	private Graph graph;

	public HydrographJob(Graph graph) {
		this.graph = graph;
	}

	public Graph getJAXBObject() {
		return graph;
	}
}