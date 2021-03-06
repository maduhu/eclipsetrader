/*
 * Copyright (c) 2004-2011 Marco Maccaferri and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Marco Maccaferri - initial API and implementation
 */

package org.eclipsetrader.core.feed;

public interface IFeedConnector2 extends IFeedConnector {

    public IFeedSubscription2 subscribeLevel2(IFeedIdentifier identifier);

    public IFeedSubscription2 subscribeLevel2(String symbol);
}
