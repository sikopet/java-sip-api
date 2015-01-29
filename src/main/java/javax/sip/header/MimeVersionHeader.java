/**
 * Copyright (C) 2015, The Open Telecoms Project, http://opentelecoms.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 */
package javax.sip.header;

import javax.sip.InvalidArgumentException;

public interface MimeVersionHeader extends Header {

	public int getMinorVersion();

	public void setMinorVersion(int minorVersion)
			throws InvalidArgumentException;

	public int getMajorVersion();

	public void setMajorVersion(int majorVersion)
			throws InvalidArgumentException;

	public final static String NAME = "MIME-Version";

}
