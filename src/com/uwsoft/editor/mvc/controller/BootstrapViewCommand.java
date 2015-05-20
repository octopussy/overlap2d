/*
 * ******************************************************************************
 *  * Copyright 2015 See AUTHORS file.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *   http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *  *****************************************************************************
 */

package com.uwsoft.editor.mvc.controller;

import com.puremvc.patterns.command.SimpleCommand;
import com.puremvc.patterns.observer.Notification;
import com.uwsoft.editor.mvc.Overlap2DFacade;
import com.uwsoft.editor.mvc.view.MidUIMediator;
import com.uwsoft.editor.mvc.view.Overlap2DMenuBarMediator;
import com.uwsoft.editor.mvc.view.Overlap2DScreenMediator;
import com.uwsoft.editor.mvc.view.stage.SandboxMediator;
import com.uwsoft.editor.mvc.view.stage.UIStageMediator;
import com.uwsoft.editor.mvc.view.ui.UIDropDownMenuMediator;
import com.uwsoft.editor.mvc.view.ui.box.UIAlignBoxMediator;
import com.uwsoft.editor.mvc.view.ui.box.UICompositeHierarchyMediator;
import com.uwsoft.editor.mvc.view.ui.box.UIGridBoxMediator;
import com.uwsoft.editor.mvc.view.ui.box.UIItemsTreeBoxMediator;
import com.uwsoft.editor.mvc.view.ui.box.UILayerBoxMediator;
import com.uwsoft.editor.mvc.view.ui.box.UIMultiPropertyBoxMediator;
import com.uwsoft.editor.mvc.view.ui.box.UIResolutionBoxMediator;
import com.uwsoft.editor.mvc.view.ui.box.UIResourcesBoxMediator;
import com.uwsoft.editor.mvc.view.ui.box.UIToolBoxMediator;
import com.uwsoft.editor.mvc.view.ui.box.UIZoomBoxMediator;
import com.uwsoft.editor.mvc.view.ui.dialog.AssetsImportDialogMediator;
import com.uwsoft.editor.mvc.view.ui.dialog.CreateNewResolutionDialogMediator;
import com.uwsoft.editor.mvc.view.ui.dialog.CustomVariablesDialogMediator;
import com.uwsoft.editor.mvc.view.ui.dialog.EditSpriteAnimationDialogMediator;
import com.uwsoft.editor.mvc.view.ui.dialog.ExportSettingsDialogMediator;
import com.uwsoft.editor.mvc.view.ui.dialog.NewProjectDialogMediator;

/**
 * Created by sargis on 4/1/15.
 */
public class BootstrapViewCommand extends SimpleCommand {
    @Override
    public void execute(Notification notification) {
        super.execute(notification);
        facade = Overlap2DFacade.getInstance();
        facade.registerMediator(new Overlap2DScreenMediator());
        facade.registerMediator(new Overlap2DMenuBarMediator());
        facade.registerMediator(new UICompositeHierarchyMediator());
        facade.registerMediator(new UIGridBoxMediator());
        facade.registerMediator(new UIResolutionBoxMediator());
        facade.registerMediator(new UIZoomBoxMediator());
        facade.registerMediator(new UIToolBoxMediator());

        // Dialogs
        facade.registerMediator(new NewProjectDialogMediator());
        facade.registerMediator(new AssetsImportDialogMediator());
        facade.registerMediator(new ExportSettingsDialogMediator());
        facade.registerMediator(new CreateNewResolutionDialogMediator());
        facade.registerMediator(new CustomVariablesDialogMediator());
        facade.registerMediator(new EditSpriteAnimationDialogMediator());

        facade.registerMediator(new MidUIMediator());

        facade.registerMediator(new UIAlignBoxMediator());
        facade.registerMediator(new UIItemsTreeBoxMediator());
        facade.registerMediator(new UIMultiPropertyBoxMediator());
        facade.registerMediator(new UILayerBoxMediator());
        facade.registerMediator(new UIResourcesBoxMediator());
        facade.registerMediator(new UIStageMediator());
        facade.registerMediator(new SandboxMediator());
        facade.registerMediator(new UIDropDownMenuMediator());
        //TODO fix and uncomment
        //facade.registerMediator(new PhysicsEditorDialogMediator());
    }
}
